/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automated_unit_testing;

/**
 *
 * @author user
 */
public class Automated_unit_testing {

    public static void main(String[] args) {
        /*
        Automated unit testing using GitHub actions-->Create a workflow
        -Complete all unit tests
        -modify the pom.xml file of your program
        -Create a workflow
        -NOTE: The JDK version included in your workflow may change depending on the version of java you have used for your program
        */
        
        name: Automated Testing


on:
  push:
  workflow_dispatch:

jobs:
  build:

    runs-on: ubuntu-latest

    steps:
      - name: Checkout
        uses: actions/checkout@v1

      - name: Set up JDK 1.11
        uses: actions/setup-java@v2
        with:
          java-version: '22'
          distribution: 'adopt'

      - name: Build
        run: mvn --batch-mode -DskipTests package

      - name: Test
        run: mvn --batch-mode -Dmaven.test.failure.ignore=true test


    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.21.0</version>
                <dependencies>
                    <dependency>
                        <groupId>org.junit.platform</groupId>
                        <artifactId>junit-platform-surefire-provider</artifactId>
                        <version>1.2.0-M1</version>
                    </dependency>
                    <dependency>
                        <groupId>org.junit.jupiter</groupId>
                        <artifactId>junit-jupiter-engine</artifactId>
                        <version>5.2.0-M1</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
    }
}
