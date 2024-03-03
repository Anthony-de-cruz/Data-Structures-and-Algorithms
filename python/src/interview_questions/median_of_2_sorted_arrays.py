def _binary_insert(nums: list[int], element: int) -> None:
    """Inserts a given element into a sorted array.
    Runtime complexity of O(log (m + n))."""

    if len(nums) == 0:
        nums.insert(0, element)
        return

    low = 0
    high = len(nums)
    half = 0

    while low < high:
        half = low + (high - low) // 2
        value = nums[half]

        if element == value:
            nums.insert(half, element)
            return
        elif value > element:
            high = half
        else:
            low = half + 1

    if nums[half] > element:
        nums.insert(half, element)
    else:
        nums.insert(half + 1, element)


def _median(nums: list[int]) -> float:
    """Returns the median of a given sorted array."""
    n = len(nums)

    if n == 1:
        return nums[0]

    if n % 2:
        return nums[(n // 2)]

    left = nums[(n // 2) - 1]
    right = nums[(n // 2)]

    return (left + right) / 2


def find_median_sorted_arrays(nums1: list[int], nums2: list[int]) -> float:
    """Returns the median of two given sorted arrays.
    Runtime complexity of O(log (m + n))."""

    for x in nums2:
        _binary_insert(nums1, x)

    return _median(nums1)


def test() -> bool:

    test_1_a, test_1_b = [1, 2], [3, 4]
    test_2_a, test_2_b = [], [2, 3]
    test_3_a, test_3_b = [3], [-2, -1]

    assert find_median_sorted_arrays(test_1_a, test_1_b) == 2.5
    assert find_median_sorted_arrays(test_2_a, test_2_b) == 2.5
    assert find_median_sorted_arrays(test_3_a, test_3_b) == -1.0

    return True


if __name__ == "__main__":
    try:
        if test():
            print("Test passed!")

    except AssertionError:
        print("Test failed!")
        raise
