Feature: random tests that sometimes fail

  @severity=trivial
  Scenario Outline: A test that fails randomly 1%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 50      |
      | 50      |
      | 50      |
      | 60      |
      | 65      |
      | 70      |

  @severity=minor
  Scenario Outline: A test that fails randomly 5%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 25      |
      | 25      |
      | 75      |

  Scenario Outline: A test that fails randomly 10%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 80      |
      | 100     |
      | 120     |

  @severity=critical
  Scenario Outline: A test that fails randomly 20%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 40      |
      | 30      |
      | 20      |

  @severity=blocker
  Scenario Outline: A test that fails randomly 50%
    Given a random number "big number" under <big_int>
    When a random number "small number" under 10
    Then number "big number" is bigger than "small number"
    Examples:
      | big_int |
      | 15      |
