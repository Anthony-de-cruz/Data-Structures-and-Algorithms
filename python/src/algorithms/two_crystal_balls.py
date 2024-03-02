import math


def two_crystal_balls(breaks: list[bool]) -> int:
    """Given 2 crystal balls, find the breaking point distance
    in the most efficient way. This implementation is O(sqrt(n))."""

    jump_amount = math.floor(math.sqrt(len(breaks)))
    breakpoint = -1

    i = 0

    # O(sqtr(n))
    for i in range(jump_amount, len(breaks), jump_amount):
        # Break the first ball
        if breaks[i]:
            i -= jump_amount
            break

    # O(sqtr(n) + sqtr(n) -> O(sqtrn)
    for walk in range(jump_amount):
        if i + walk > len(breaks):
            break
        # Break the second ball
        if breaks[i + walk]:
            breakpoint = i + walk
            break

    return breakpoint


def test() -> bool:
    """Throws AssertionError if failed."""

    test_1 = [False if x < 49 else True for x in range(100)]
    test_2 = [False if x < 0 else True for x in range(100)]
    test_3 = [False if x < 99 else True for x in range(100)]
    test_4 = [False if x < 2 else True for x in range(10)]

    assert two_crystal_balls(test_1) == 49
    assert two_crystal_balls(test_2) == 0
    assert two_crystal_balls(test_3) == 99
    assert two_crystal_balls(test_4) == 2

    test_5 = [False for _ in range(100)]

    assert two_crystal_balls(test_5) == -1

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
