# JavaWeb-HF
personal project

1.创建javaWeb项目
  1.create new project选择Java enterprise --> Web Application，如果没有选择jdk或者tomcat需要选择一下；
  2.在web目录下的WEB-INF文件夹下创建classes（将classes文件夹在path中设置成Use module compile output path路径）和lib（将lib文件夹设置成JARs or directories文件夹类型）

2.将javaWeb项目打成jar包
  1.ctrl + shift + alt + s 打开Project Structure窗口；
  2.选择Artifacts-->点击“+”号-->选择Web Application：Archive-->Empty（此时可以修改右边的Name也就是war的名称）；
  3.点击“+”号选择Directory Content选择项目的web根目录，然后点击create directory创建文件夹图标，创建WEB-INF文件夹，在此文件夹下创建classes文件夹；
  4.在classes文件夹上点击“+”号选择Module Output然后选择当前项目点击ok，如果依赖了jar包会出现添加lib中jar包的提示，在提示中点击fix添加依赖jar包文件即可；
  5.点击idea最顶部菜单栏的Build-->Build Artifact-->选择创建的war执行Build即可，然后找到对应路径下的jar包即可。
  6.将war包放置tomcat的webapps目录下，启动tomcat，访问路径为，例如localhost:8080/war包名称。
