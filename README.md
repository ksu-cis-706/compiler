# Compiler

[![Run Status](https://api.shippable.com/projects/55534a22edd7f2c052ebbc77/badge?branch=master)](https://app.shippable.com/projects/55534a22edd7f2c052ebbc77)

[API doc](https://cdn.rawgit.com/ksu-cis-706/compiler/master/sjc/doc/api/index.html)

This repository hosts the StaticJava Compiler (sjc) source code for 
[K-State CIS 706 graduate course on Translator Design I](http://compilers.santoslab.org).


## Requirements

* [Java 8](https://jdk8.java.net/)

* [Sbt](http://scala-sbt.org)

Alternatively, you can use Java and Sbt included in 
[Sireum v3](https://github.com/sireum/v3#installing-and-running-sireum) 
(either IVE or CLI).

Java can be found at ``SIREUM_HOME/platform/java`` and
Sbt can be found at ``SIREUM_HOME/platform/sbt``.


## Compiling and Testing

```
sbt test
```


## Running sjc

```
sbt "sjc <filepath.java>"
```

For example,

```
sbt "sjc sjc/src/test/java/Power.java"
```


## Development Environment

It is recommended to use 
[Sireum IVE](https://github.com/sireum/v3#sireum-integrated-verification-environment-ive)
which comes with all the necessary plugins for this project.

Alternatively, you can use [IntelliJ](https://www.jetbrains.com/idea/) 
with the following plugins installed:

* [Scala](https://plugins.jetbrains.com/plugin/1347)

* [Sbt](https://plugins.jetbrains.com/plugin/5007)

* [ANTLR v4 grammar plugin](https://plugins.jetbrains.com/plugin/7358)

* [JDT ASTView plugin](https://plugins.jetbrains.com/plugin/9345)

* [ASM Bytecode Outline](https://plugins.jetbrains.com/plugin/5918)

* [Markdown support](https://plugins.jetbrains.com/plugin/7793)
