X3D Edit 3.3 build instructions
-------------------------------
This application is built entirely from and within Netbeans.  No command-line Ant building has been
tested.

1. Use Netbeans 12.3 or later. 

2. Insure that the Subversion plugin is installed in Netbeans (Tools->plugins).

3. Insure that the subversion command line client ("svn") is installed on your machine.  Get it
   from http://subversion.tigris.org .

4. Launch Netbeans and checkout the source through subversion:
  a. Versioning->Subversion->Checkout
  b. Repository URL: https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/tools/X3dEdit3.3/
     svn checkout https://svn.code.sf.net/p/x3d/code/www.web3d.org/x3d/tools/X3dEdit3.3/ x3d-code/www.web3d.org/x3d/tools/X3dEdit3.3/
     or, for everything,
     svn checkout https://svn.code.sf.net/p/x3d/code/www.web3d.org/ x3d-code/www.web3d.org/
  c. User : leave blank (anonymous)
  d. Password : leave blank
  e. Next
  f. Repository folder: browse to www.web3d.org/x3d/tools/X3dEdit3.3
  g. Local folder: browse to a location which will receive a single X3dEdit3.3 directory
  h. Select the "Scan for Netbeans projects after checkout".
  i. Click Finish

5. After the checkout, end up with the following projects opened in Netbeans (if you selected the Open Projects option):
  ApacheXMLApis
  Collada
  JavaHelpWrapper
  JdomWrapper
  KMLEditor
  X3dAppConfiguration
  X3D-Edit
  X3dEditorSuite
  Xj3dWrapper

6. Set X3D-Editor Suite as Netbeans' "main" project

7. For each module, except the suite, run ant tasks "fix-dependencies" & 
   "fix-test-dependencies" to update module dependencies in order to migrate to 
   newer NB platforms > 12.3

8. Build, Clean and Build, and Run should now work with no errors.


Building the application for distribution
-----------------------------------------
A. There are 4 deployment ant targets available through 
   "X3dEditorSuite/Important Files/Build Script":
   1 x3dedit-modules-build-zip
   2 x3dedit-modules-build-and-deploy-to-server
   3 x3dedit-zipapplication_build
   4 x3dedit-zipapplication-build-and-deploy-to-server

   The first makes the 3 nbm files which may be loaded into a running netbeans 
   ide to provide x3d-editing capabilities. #2 does #1, then uploads to the web 
   page. Number 3 makes a zip file which contains the stand-alone x3d editor
   application. #4 does #3, then uploads.

B. To cause the nbm files to be properly "signed" during the build, obtain the 
   proper "keystore" file ("movesJarSigningKeystore") and password, and install 
   this file into each of the 8 project trees at 
   nbproject/private/movesJarSigningKeystore. Optionally, put the password for 
   the keystore into nbproject/private/private.properties assigned to the 
   "storepass" property. This eliminates having to enter the password 8 times 
   when building the modules.

C. To be able to deploy to the web server(s), enter your logon username and 
   password into X3dEditorSuite/nbproject/private/private.properties assigned to 
   the "deploy.username" and "deploy.password" properties.  This is optional -- 
   if the 2 properties are not defined, you will be prompted for name and 
   password during execution of each "...deploy-to-server" target.

D. To update the version number, go to X3D-Edit module Properties, then API 
   Versioning, then Specification Version, and increment the value.

E. Run the X3dEditorSuite build.xml x3dedit-deploy-all task, which will invoke 
   all of the 4 tasks listed in step A.

End.
