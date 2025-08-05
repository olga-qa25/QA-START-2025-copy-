Feature: random tests that sometimes fail

  Scenario Outline: A test that fails randomly
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 100     |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |