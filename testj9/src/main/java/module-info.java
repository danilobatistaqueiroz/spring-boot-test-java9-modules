module com.example.demo {
  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires com.sample.printer;

  requires spring.web;
  requires spring.webmvc;

  requires spring.beans;
  requires spring.core;
  requires org.apache.tomcat.embed.core;

  exports com.example.demo;
  exports com.web.controllers;

  opens com.example.demo to spring.core;
}