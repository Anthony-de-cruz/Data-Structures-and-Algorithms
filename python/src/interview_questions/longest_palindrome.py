def is_palindrome(string: str) -> bool:
    """Verify that a given string is palindromic."""

    if string == string[::-1]:
        return True
    return False


def longest_palindrome(string: str) -> str:
    """Given a string, return the longest palindromic substring."""

    if len(string) < 2:
        return string

    if is_palindrome(string):
        return string

    longest = ""

    for x in range(len(string)):
        for y in range(x, len(string)):
            sub_string = string[x : y + 1]

            if is_palindrome(sub_string) and len(sub_string) > len(longest):
                longest = sub_string
                continue

    return longest


def test() -> bool:

    test_1 = "abb"
    test_2 = "bba"
    test_3 = "aaaa"

    assert longest_palindrome(test_1) == "bb"
    assert longest_palindrome(test_2) == "bb"
    assert longest_palindrome(test_3) == "aaaa"

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
