## To test the applications
* Compile the classes under the collections package of list-sample and applications package of test-ground.

```
javac -d bin -classpath "bin" list-sample/src/collections/**/*.java test-ground/src/applications/list/ListMain.java test-ground/src/applications/list/GenericListMain.java

```
* To check the LinkedList

```
java -classpath "bin" applications.list.ListMain

```

* To test the generic LinkedList

```
java -classpath "bin" applications.list.GenericListMain

```