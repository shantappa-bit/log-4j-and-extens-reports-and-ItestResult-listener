$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5171077200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Successfull login with invalid credentials",
  "description": "",
  "id": "login;successfull-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user has opened the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters a url as \"https://ui.freecrm.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "verify that login page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters user name as \"shantu147@gmail.com\" and password as \"Godvs400\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "verify that home page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the log out link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "verify that login page should be dispayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_has_opened_the_browser()"
});
formatter.result({
  "duration": 178754000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://ui.freecrm.com/",
      "offset": 22
    }
  ],
  "location": "Steps.user_enters_a_url_as(String)"
});
formatter.result({
  "duration": 6523611500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_that_login_page_should_be_displayed()"
});
formatter.result({
  "duration": 13877900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shantu147@gmail.com",
      "offset": 26
    },
    {
      "val": "Godvs400",
      "offset": 64
    }
  ],
  "location": "Steps.user_enters_user_name_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 486260900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 666538800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_that_home_page_should_be_displayed()"
});
formatter.result({
  "duration": 7837900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_the_log_out_link()"
});
formatter.result({
  "duration": 6413374900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_that_login_page_should_be_dispayed()"
});
formatter.result({
  "duration": 3187132500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "duration": 16200,
  "status": "passed"
});
formatter.after({
  "duration": 154682400,
  "status": "passed"
});
});