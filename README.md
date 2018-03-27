# testOpenTcs
testOpenTcs
#采用源码编译，本地maven安装的方式

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-API-Base\build\libs\opentcs-api-base-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-api-base -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true  

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-API-Injection\build\libs\opentcs-api-injection-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-api-injection -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true  

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-CommAdapter-Loopback\build\libs\opentcs-commadapter-loopback-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-commadapterloopback -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-Common\build\libs\opentcs-common-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-common -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-Kernel\build\libs\opentcs-kernel-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-kernel -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true

mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-PlantOverview\build\libs\opentcs-plantoverview-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-plantoverview -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true


mvn install:install-file -Dfile=D:\WorkSpace\openTCS-4.8.4-src路径规划\openTCS-Strategies-Default\build\libs\opentcs-strategies-default-4.8.4-SNAPSHOT.jar -DgroupId=org.opentcs -DartifactId=opentcs-strategiesdefault -Dversion=4.8.4 -Dpackaging=jar -DgeneratePom=true -DcreateChecksum=true
