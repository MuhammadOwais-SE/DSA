# What is a "Sliding Window"?
# Imagine you are looking at a long strip of film through a small square hole in a piece of cardboard. You can only see a small section of the film at a time. To see more, you slide the cardboard along the film.

# In programming, a Sliding Window is just a way to look at a subset (a "window") of an array or string. You move this window from left to right to process the data efficiently.

# The "Brute Force" Problem (The Slow Way)
# Imagine you have nums = [2, 1, 5, 1, 3, 2] and you want to find the maximum sum of 3 consecutive numbers.

# Window 1: [2, 1, 5] -> Sum = 8

# Window 2: [1, 5, 1] -> Sum = 7

# Window 3: [5, 1, 3] -> Sum = 9  <-- Winner

# Window 4: [1, 3, 2] -> Sum = 6

# Why brute force is slow:
# If you calculate the sum from scratch every time, you are wasting energy. To get from Window 1 to Window 2, you already know the sum of 1+5. You don't need to re-add them!

# The Sliding Window Strategy (The Fast Way)
# Instead of re-calculating, we do this:

# Initial State: Sum up the first k elements (e.g., the first 3). This is your current_sum.

# The Slide: To move to the next window:

# Subtract the number that is leaving the window (the one on the far left).

# Add the number that is entering the window (the one on the far right).

# Compare this new sum to your "max" sum so far.

# Look at the math for our example:

# Initial Sum (Window 1): 2 + 1 + 5 = 8. (max_sum = 8)

# Slide to Window 2:

# 8 (current sum) - 2 (the number leaving) + 1 (the number entering) = 7.

# 7 is not bigger than 8, so max_sum stays 8.

# Slide to Window 3:

# 7 (current sum) - 1 (the number leaving) + 3 (the number entering) = 9.

# 9 is bigger than 8, so max_sum becomes 9.


# 📝 Problem: Maximum Subarray Sum (Fixed Size Window)Description:Given an array of integers nums and an integer k, 
# find the maximum sum of any contiguous subarray of size k.Constraints:$1 \le nums.length \le 10^5$$1 \le k \le nums.length$$-10^4 \le nums[i] \le 10^4$Function Signature:Pythondef max_subarray_sum(nums: list[int], k: int) -> int:
    # Your code here

def max_subarray_sum(nums: list[int], k: int) -> int:
    current_sum = sum(nums[:k])
    max_sum = current_sum
    print("Current sum before the loop",current_sum)
    # k decide our slide window
    #  [0:k+1]

    for i in range(k, len(nums)):
        # max_sum = (current num - left num) + right num
        # then we compare with is it greater then max-sum or not
        

        # current_sum = current_sum - nums[i-k] + nums[i]
        current_sum = current_sum + nums[i] - nums[i - k]
        print(max_sum)    

        if max_sum < current_sum:
            max_sum = current_sum 
    
    return max_sum


    # Your code here

if __name__ == "__main__":
    # Test 1: Standard case
    # Window [2,1,5] sum=8, [1,5,1] sum=7, [5,1,3] sum=9, [1,3,2] sum=6
    print(max_subarray_sum([2, 1, 5, 1, 3, 2], 3)) # Expected Output: 9

    # Test 2: k = 1 (Max element in the array)
    print(max_subarray_sum([2, 3, 4, 1, 5], 1))    # Expected Output: 5

    # Test 3: k = length of array (Sum of everything)
    print(max_subarray_sum([1, 2, 3, 4], 4))       # Expected Output: 10

    # Test 4: Array with negative numbers
    print(max_subarray_sum([-1, -2, -3, -4], 2))   # Expected Output: -3


# Problem 2: Minimum Size Subarray Sum (LeetCode #209)Description:Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.


def min_subarray_len(target: int, nums: list[int]) -> int:
    min_length = float("inf")

    left = 0
    sum = 0
    # range is like accordian right side is nums and left side is like a pointer.
    # right pointer (Expand): Pulls the right side out one step at a time to take in more numbers.
# left pointer (Shrink): Squeezes the left side in as long as the sum stays above or equal to target.
    for right in range(len(nums)): # right pointer
        sum += nums[right]
        # 2, 5, 6, 8
        # We want to keep shrinking as long as the window remains valid. so we won't use "if" we will used while

        while (sum >= target):
          # record the window length

          window_length = right-left +1
          min_length = min(min_length, window_length)
        #   print(min_length)
        
          # now time to shrink from left. 
          sum -= nums[left]
          left += 1 

    if min_length == float("inf"):
      return 0
        
    return min_length

target = 7
nums = [2, 3, 1, 2, 4, 3]


print(min_subarray_len(target, nums))




