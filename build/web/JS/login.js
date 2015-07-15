jQuery(document).ready(function() {
  jQuery("#loginLink").click(function( event ){
    event.preventDefault();
    jQuery(".overlay").fadeIn("slow").css("display","flex");
  });

  jQuery(".close").click(function() {
	  location.hash='';
    jQuery(".overlay").fadeOut(500);

  });

  jQuery(document).keyup(function(e) {
    if(e.keyCode == 27 && jQuery(".overlay").css("display") != none ) {
      event.preventDefault();
      location.hash='';
      jQuery(".overlay").fadeOut(500);
    }
  });
  $('#somebutton').click(function() {
  	var num = $("#cash").val();
      //$.post('dabloon', {numval : num},
      $.get('http://192.168.0.171:8080/Dabloonexchange/api/Service/' + num, function(responseText) {
      	$('#somediv').text(responseText);
    	});
  });

  $('#crewButton').click(function() {
  	$.post('crewRoster', function(jCrew){
  		$('#crewList').empty();
  		$.each(jCrew, function(key, value){
  			$('#crewList').append('<li><a data-reveal-id="editModal" class="updateButton" id=' + JSON.stringify(value) + '>' + value.firstname + " " + value.lastname + " " + value.share + "</a></li>");
  		});
  		$('a.updateButton').click(function(event) {
  			var crewStat = $.parseJSON(event.target.id);
  			$('#id').val(crewStat.id);
  			$('#fname').val(crewStat.firstname);
  			$('#lname').val(crewStat.lastname);
  			$('#share').val(crewStat.share);

  	  });
  	});

  });
  $('#editModalButton').click(function(){
      event.preventDefault();
      if($(this).text() == 'edit'){
        $('#fname').prop('disabled', false);
        $('#lname').prop('disabled', false);
        $('#share').prop('disabled', false);
        $(this).text('save');
        $(this).prop('class', 'saveButton');
      }
      else if($(this).text() == 'save'){
        $('#fname').prop('disabled', true);
        $('#lname').prop('disabled', true);
        $('#share').prop('disabled', true);
        $(this).text('edit');
        $(this).prop('class', 'editButton');
        var crewObject = new Object();
        crewObject.id = $('#id').val();
        crewObject.firstname = $('#fname').val();
        crewObject.lastname = $('#lname').val();
        crewObject.share = $('#share').val();
        var crewString = JSON.stringify(crewObject);
        $.post('edits', { crewStats : crewString}, function(){});
      }
  });


});
