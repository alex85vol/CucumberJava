Feature: Belly

  Background:
    Given I hve 42 cukes in my belly

  Scenario: a few cukes
    When I wait 1 hour
    Then my belly should growl