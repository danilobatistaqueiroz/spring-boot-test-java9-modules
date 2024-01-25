module com.sample.printer {
  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires spring.context;
  requires spring.beans;
  exports br.labs.flop;
  exports com.sample.printer;
}