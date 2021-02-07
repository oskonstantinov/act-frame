Simple BDD testing framework for UI and API, based on Serenity, including the reporting part. Java 11 + Maven + Serenity (included RestAssured) + Selenium

Get the code

```
git clone https://github.com/oskonstantinov/act-frame.git
cd ~/act-frame
```

Run easy with `mvn clean verify` on default mode or `mvn clean verify -Denvironment=dev` if you want to change
environment. You can also change the Chrome or Firefox browser version on `serenity.conf`. Then, if you want to run some specific set, you need to
add tags `mvn clean verify -Denvironment=dev -Dcucumber.filter.tags="@smoke"`.
Finally, if you want to get complete report for different browsers, you can run as 
```
mvn clean verify -Dcontext=chrome
mvn verify -Dcontext=firefox -Denvironment=dev
```