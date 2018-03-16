Feature: Open site
  @safariFirst
  Scenario: Open site

    When [safari] I open site with text "http://www.google.com"
    And  [safari] I close safari