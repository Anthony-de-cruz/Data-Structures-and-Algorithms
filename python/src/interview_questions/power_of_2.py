def power_of_2(term: int) -> bool:
    """Check if the term is a power of 2 without using division."""
    if term < 2 or (term & term - 1):
        return False

    return True

def test() -> bool:

    test_1 = [0, 1, 2, 17, 28, 
              8, 64, 32, 129]
    answers = [False, False, True, False, False,
               True, True, True, False]

    for x, term in enumerate(test_1):
        assert power_of_2(term) == answers[x]

    return True

if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
