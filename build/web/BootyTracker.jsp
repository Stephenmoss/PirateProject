<%-- 
    Document   : BootyTracker
    Created on : Jul 14, 2015, 2:51:04 PM
    Author     : smoss
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="en" data-useragent="Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.2; Trident/6.0)">
  <head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>BootyTracker</title>
    <meta name="description" content="Documentation and reference library for ZURB Foundation. JavaScript, CSS, components, grid and more."/>
    <meta name="author" content="ZURB, inc. ZURB network also includes zurb.com"/>
    <meta name="copyright" content="ZURB, inc. Copyright (c) 2015"/>
    <link rel="stylesheet" href="css/foundation.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script src="js/vendor/modernizr.js"></script>

  </head>
  <body>
    <div class="row">
      <div class="large-12 columns">
        <nav class="top-bar" data-topbar>
          <ul class="title-area">
            <li class="name">
              <h1><a href="#">BootyTracker</a></h1>
            </li>
          </ul>
          <section class="top-bar-section">
            <ul class="left">
              <li></li>
            </ul>
            <ul class="right">
              <li class="search"></li>
              <li class="has-button"></li>
            </ul>
          </section>
        </nav>
      </div>
    </div>
    <div class="row">
      <div class="large-12 columns">
        <div class="hide-for-small">
          <div id="featured"><img alt="slide image" src="img/CotBPBarbo_corpsefix.jpg"></div>
        </div>
        <div class="row">
          <div class="small-12 show-for-small">
            <br>
            <img src="img/CotBPBarbo_corpsefix.jpg">
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="large-12 columns">
        <div class="menu-spacer bar-match">
          <div class="row">
            <a href="#" id="crewButton" data-reveal-id="crewModal">
              <div class="large-3 small-6 columns">
                <img src="img\crows-nesfix.jpg">
                <h6 class="panel">Crew Roster</h6>
              </div>
            </a>
            <div id="crewModal" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
              <h2 id="modalTitle">Crew Roster</h2>
              <ul id="crewList"></ul>
              <a class="close-reveal-modal" aria-label="Close">&#215;</a>
            </div>
            <div id="editModal" class="reveal-modal" data-reveal aria-labelledby="editModalTitle" aria-hidden="true" role="dialog">
          <form id="crewData">
            <input type="hidden" name="id" id="id" value="">
            First name: <input type="text" name="fname" id="fname" disabled>
            <br>
            Last name: <input type="text" name="lname" id="lname" disabled>
            <br>
            Share: <input type="text" name="share" id="share" disabled>
            <br>
            <button id="editModalButton" class="editButton">edit</button>
          </from>
  				<a class="close-reveal-modal" aria-label="Close">&#215;</a>
			</div>
            <a href="#" data-reveal-id="shipModal">
              <div class="large-3 small-6 columns">
                <img src="img\The_Intercepter_moments_before_its_destruction.jpg">
                <h6 class="panel">Ship Destroyed</h6>
              </div>
            </a>
            <div id="shipModal" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
              <h2 id="modalTitle">Awesome. I have it.</h2>
              $<input type="text" id="cash"/>
              <button id="somebutton">GO!</button>
              <div id="somediv"></div>
              <a class="close-reveal-modal" aria-label="Close">&#215;</a>
            </div>
            <a href="#" data-reveal-id="statModal">
              <div class="large-3 small-6 columns">
                <img src="img\ringanddebloomfix.jpg">
                <h6 class="panel">Booty Stats</h6>
              </div>
            </a>
            <div id="statModal" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
              <h2 id="modalTitle">Awesome. I have it.</h2>
              <p class="lead">Your couch.  It is mine.</p>
              <p>I'm a cool paragraph that lives inside of an even cooler modal. Wins!</p>
              <a class="close-reveal-modal" aria-label="Close">&#215;</a>
            </div>
            <a href="#" data-reveal-id="munstopModal">
              <div class="large-3 small-6 columns">
                <img src="img\blackbeard-boarding-maynards-shipfix.jpg">
                <h6 class="panel">Muninity Stop 6</h6>
              </div>
            </a>
            <div id="munstopModal" class="reveal-modal" data-reveal aria-labelledby="modalTitle" aria-hidden="true" role="dialog">
              <h2 id="modalTitle">COMING WINTER 2016!!!</h2>
              <a class="close-reveal-modal" aria-label="Close">&#215;</a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <footer class="row">
      <div class="large-12 columns">
        <div class="row">
          <div class="large-6 columns">
            <p class="bottom-elem">© Copyright no one at all. Go to town.</p>
          </div>
        </div>
      </div>
    </footer>

    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation/foundation.js"></script>
   	<script src="js/login.js"></script>

  </body>
</html>
