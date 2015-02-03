Compiler
========

Setting Up Development Environment
----------------------------------

1. Download and install Sireum (stable, 64-bit) by following the instructions at: 
   http://www.sireum.org/download.
   
   (Alternatively, you can install the compiler tools listed at:
   http://compilers.santoslab.org/notes.html) 

2. Launch `Eclipse in Sireum <http://www.sireum.org/features.html>`_ 
   (add ``-h`` on the second command for help to supply custom Eclipse 
   command-line arguments such as configuring memory; the default memory
   configuration is for 1GB max heap space)::

       sireum install Antlr
       sireum launch eclipse

   Pick a directory for your workspace when asked.
   
   If you plan to use Scala to work on your projects, launch the
   Sireum Development Environment instead (with at least 2GB heap space)::
   
       sireum launch sireumdev -j "-Xms512m,-Xmx2048m"

3. Add ``SIREUM_HOME/apps/platform/java`` in Eclipe's 
   `Java Installed JREs preference page <http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fdebug%2Fref-installed_jres.htm>`_,
   and make it the default. In addition, set Eclipse's `Java Compiler compliance level <http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fref-preferences-compiler.htm>`_ to 1.7.
   (Similarly, if you are using Scala, you need to set the Scala compiler to generate jvm-1.7 bytecode.)
   
4. Download the `StaticJava Compiler (sjc) project set file <https://github.com/santoslab/compiler/blob/master/sjc.psf>`_.
   `Import the project set file <http://wiki.eclipse.org/PSF>`_.
   This should import two projects into your workspace:
   
   * `compiler-sjc <https://github.com/santoslab/compiler/tree/master/compiler-sjc>`_
   
   * `compiler-examples <https://github.com/santoslab/compiler/tree/master/compiler-examples>`_.
    
   There should not be any compile error. 
   
5. Run the JUnit tests in ``compiler-sjc`` and ``compiler-examples`` by 
   right clicking each of the projects and select "Run As" and then 
   "JUnit Test"; all tests should pass. 
