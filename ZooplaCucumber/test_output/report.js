$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase2.feature");
formatter.feature({
  "line": 1,
  "name": "Zoopla Application to check prices for a place",
  "description": "",
  "id": "zoopla-application-to-check-prices-for-a-place",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "checking house prices",
  "description": "",
  "id": "zoopla-application-to-check-prices-for-a-place;checking-house-prices",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Zoopla application is launched for \"\u003ctestName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on house prices",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter place name \"\u003cPlace\u003e\" in search box",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "place with price is displayed.",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "zoopla-application-to-check-prices-for-a-place;checking-house-prices;",
  "rows": [
    {
      "cells": [
        "testName",
        "Place"
      ],
      "line": 10,
      "id": "zoopla-application-to-check-prices-for-a-place;checking-house-prices;;1"
    },
    {
      "cells": [
        "test2",
        "London Road, Addington, West Malling ME19"
      ],
      "line": 11,
      "id": "zoopla-application-to-check-prices-for-a-place;checking-house-prices;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6821408500,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "checking house prices",
  "description": "",
  "id": "zoopla-application-to-check-prices-for-a-place;checking-house-prices;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Login to Zoopla application is launched for \"test2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on house prices",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter place name \"London Road, Addington, West Malling ME19\" in search box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "place with price is displayed.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "test2",
      "offset": 45
    }
  ],
  "location": "CheckPricesStepdef2.login_to_Zoopla_application_is_launched_for(String)"
});
formatter.result({
  "duration": 1584200,
  "status": "passed"
});
formatter.match({
  "location": "CheckPricesStepdef2.click_on_house_prices()"
});
formatter.result({
  "duration": 4220758200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London Road, Addington, West Malling ME19",
      "offset": 18
    }
  ],
  "location": "CheckPricesStepdef2.enter_place_name_in_search_box(String)"
});
formatter.result({
  "duration": 3208271100,
  "status": "passed"
});
formatter.match({
  "location": "CheckPricesStepdef2.place_with_price_is_displayed()"
});
formatter.result({
  "duration": 15900,
  "status": "passed"
});
formatter.after({
  "duration": 63488300,
  "status": "passed"
});
});