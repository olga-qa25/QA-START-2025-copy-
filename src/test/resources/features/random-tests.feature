Feature: random tests that sometimes fail

  @severity=trivial
  Scenario Outline: A test that fails randomly 1%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |
      | 1000    |

  @severity=minor
  Scenario Outline: A test that fails randomly 5%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 500     |
      | 500     |
      | 500       |

  Scenario Outline: A test that fails randomly 10%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 100     |
      | 100     |
      | 100     |

  @severity=critical
  Scenario Outline: A test that fails randomly 20%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 50      |
      | 50      |
      | 50       |

  @severity=blocker
  Scenario Outline: A test that fails randomly 50%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 10      |
