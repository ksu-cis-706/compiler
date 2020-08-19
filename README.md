# Compiler

[![Actions Status](https://github.com/ksu-cis-706/compiler/workflows/CI/badge.svg)](https://github.com/ksu-cis-706/compiler/actions)

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

* [ANTLR v4 grammar plugin](https://plugins.jetbrains.com/plugin/7358)

* [JDT ASTView plugin](https://plugins.jetbrains.com/plugin/9345)

* [ASM Bytecode Viewer](http://plugins.jetbrains.com/plugin/10302-asm-bytecode-viewer)

* [Markdown support](https://plugins.jetbrains.com/plugin/7793)
