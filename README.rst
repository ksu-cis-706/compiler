Compiler
========

Setting Up Development Environment
----------------------------------

1. Download and install Sireum by following the instructions at: 
   http://www.sireum.org/download.
   
   (Alternatively, you can install the compiler tools listed at:
   http://compiler.santoslab.org/tools) 

2. Launch `Compiler Development Environment (DE) <http://www.sireum.org/features>`_ 
   (add ``-h`` for help to supply custom Eclipse command-line arguments such
   as configuring memory)::

       sireum launch compilerdev

   Pick a directory for your workspace when asked.

3. Add ``SIREUM_HOME/apps/platform/java`` in Eclipe's 
   `Java Installed JREs preference page <http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fdebug%2Fref-installed_jres.htm>`_,
   and make it the default. In addition, set Eclipse's `Java Compiler compliance level <http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Fref-preferences-compiler.htm>`_ to 1.7.
   (If Eclipse shows you a dialog box indicating that "Subversive Native Library Not Available",
   it means that you do not have native SVN installed; click Ok to close the 
   dialog box. You can correct this issue by setting SVN Interface Client to 
   "SVNKit" in the  Eclipse's Team->SVN preference page.)
   
4. Download the `StaticJava Compiler (sjc) project set file <https://github.com/santoslab/compiler/blob/master/sjc.psf>`_.
   `Import the project set file <http://wiki.eclipse.org/PSF>`_.
   This should import two projects into your workspace:
   
   * `compiler-sjc <https://github.com/santoslab/compiler/tree/master/compiler-sjc>`_
   
   * `compiler-examples <https://github.com/santoslab/compiler/tree/master/compiler-examples>`_.
    
   There should not be any compile error. 
   
5. Run the JUnit tests in ``compiler-sjc`` and ``compiler-examples`` by 
   right clicking each of the projects and select "Run As" and then 
   "JUnit Test"; all tests should pass. 
