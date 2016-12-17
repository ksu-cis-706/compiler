# Compiler

[![Run Status](https://api.shippable.com/projects/55534a22edd7f2c052ebbc77/badge?branch=master)](https://app.shippable.com/projects/55534a22edd7f2c052ebbc77)

[API doc](https://cdn.rawgit.com/ksu-cis-706/compiler/master/sjc/doc/api/index.html)

This repository hosts the StaticJava Compiler (sjc) source code for 
[K-State CIS 706 graduate course on Translator Design I](http://compilers.santoslab.org).

## Requirements

* Java 8 (or above)

* [Sbt](http://scala-sbt.org)

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

[IntelliJ](https://www.jetbrains.com/idea/) with the following plugins installed:

* [Scala](https://plugins.jetbrains.com/plugin/1347)

* [Sbt](https://plugins.jetbrains.com/plugin/5007)

* [ANTLR v4 grammar plugin](https://plugins.jetbrains.com/plugin/7358)

* [JDT ASTView plugin](https://plugins.jetbrains.com/plugin/9345)

* [ASM Bytecode Outline](https://plugins.jetbrains.com/plugin/5918)

* [Markdown support](https://plugins.jetbrains.com/plugin/7793)

* [SnakeYAML](https://plugins.jetbrains.com/plugin/8142)