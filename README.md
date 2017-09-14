# LocalMavenRepo
A example to use local maven repo for android studio.

使用 compile 'com.andev.testgradle:locallibrary:0.0.1'的方式引用本地库。

构建过程中可能出现的问题：

1.根目录下命令生成本地库./gradlew -p locallibray clean build uploadArchives --info，
可能会出现Unsupported major.minor version 52.0错误。  
解决方法：  
在根目录下的gradle.properties中加入和android studio一致的jdk
org.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk1.8.0_40.jdk/Contents/Home
