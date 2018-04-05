Feature: Der User kann Währungen umrechnen
Scenario Outline: Wechsel von EUR -> USD
Given Der User hat <eur> EUR
When Er ruft EUR Wechsel Funktionalität auf
Then Der User erhält <usd> USD
Examples:
|eur|usd|
|1|1.23993|
|2|2.47986|
|14.5|17.978985|
|-3|0|
|0|0|
Scenario Outline: Wechsel von USD -> EUR
Given Der User hat <usd> USD
When Er ruft USD Wechsel Funktionalität auf
Then Der User erhält <eur> EUR
Examples:
|eur|usd|
|1|1.23993|
|2|2.47986|
|14.5|17.978985|
|0|0|
|0.806497|1|
|0|-3|



