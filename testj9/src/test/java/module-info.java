module com.example.test {

  requires com.sample.printer;

  requires org.mockito;

  requires spring.beans;

  requires org.assertj.core;

  requires org.junit.jupiter.api;
  requires org.junit.jupiter.engine;

  requires com.example.demo;

  exports com.example.test;

  requires net.bytebuddy.agent;
  requires net.bytebuddy;

  opens com.example.test to org.junit.platform.commons, spring.core;
}