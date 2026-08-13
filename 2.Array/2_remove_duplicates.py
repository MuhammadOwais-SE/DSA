"""
PROBLEM 2: Remove Duplicates from Sorted Array

Given an integer array 'nums' sorted in non-decreasing order, remove the duplicates 
in-place such that each unique element appears only once. The relative order of the 
elements should be kept the same. Then return the number of unique elements in 'nums'.

To be accepted, your code must modify the original 'nums' array directly in memory 
with O(1) extra space. Do not create a new list!

--------------------------------------------------------------------------------
EXAMPLES:

Example 1:
Input: nums = [1, 1, 2]
Expected Output: 2
Explanation: Your function should return 2. The first two elements of nums 
             should be mutated to [1, 2]. It does not matter what you leave 
             beyond the returned length.

Example 2:
Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
Expected Output: 5
Explanation: Your function should return 5. The first five elements of nums 
             should be mutated to [0, 1, 2, 3, 4].
--------------------------------------------------------------------------------
"""
# Problem 2 tests your ability to do the exact opposite: optimizing for resource-constrained environments.
# By forcing you to use $O(1)$ auxiliary space, the problem tests if you can manipulate raw pointers directly 
# inside data structures without relying on memory safety nets.
"""
Database Indexing: When a database (like MySQL or Postgres) cleans up duplicate keys in a giant, sorted index file that is gigabytes long, it cannot duplicate that file in RAM. It must overwrite data in-place directly on the disk block.

Embedded Systems / IoT: If you are writing software for a smart router, medical device, or automotive chip, memory is extremely scarce. Creating an extra array could crash the entire hardware stack due to an "Out of Memory" error.

Data Streams: If you are processing a continuous live stream of sensor data, allocating new memory objects for every duplicate will trigger Java or Python's Garbage Collector constantly, slowing down your system's throughput.

💬 The Interviewer Pitch
Identify the Property:
 "Since the input array is already sorted, we know that all duplicate elements are clustered together consecutively. 
 We can exploit this property to find duplicates in a single linear scan.

"State the Strategy: "To avoid allocating an extra array and keep our space complexity at an optimal $O(1)$, I will use a two-pointer technique.
 A 'read' pointer will scan ahead through the data, while a 'write' pointer will track the boundary of unique elements and
  overwrite duplicates in-place.
  
  "State the Complexity: "This allows us to achieve a time complexity of $O(n)$ because we only pass through the array once, with 
  a space complexity of $O(1)$ because we are repurposing the input array's existing memory slots."

When Google asks this, they want to see if you understand that memory writes are cheap, but memory allocations are expensive. 
Shifting elements around in an existing array is vastly more efficient for a system's CPU and RAM than asking the operating system to allocate a brand-new chunk of memory.

"""



def remove_duplicates(nums: list[int]) -> int:
    if not nums:
        return 0
    
    write_index = 1

    for i in range(1, len(nums)):
        
        if nums[i] == nums[i-1]:
            
            pass
        else:
            nums[write_index] = nums[i]
            write_index += 1
    return write_index, nums

nums = [1, 1, 2]
# print(
# remove_duplicates(nums)
# )

"""
PROBLEM 3: Two Sum (The Dictionary/Map Version)

Given an array of integers 'nums' and an integer 'target', return the indices 
of the two numbers such that they add up to 'target'.

You must solve this using a Python dictionary to achieve an optimal O(n) time complexity. 
You are returning the POSITIONS (indices) of the numbers this time, not the values.

--------------------------------------------------------------------------------
EXAMPLES:

Example 1:
Input: nums = [2, 7, 11, 15], target = 9
Expected Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3, 2, 4], target = 6
Expected Output: [1, 2]
Explanation: Because nums[1] + nums[2] == 6, we return [1, 2].

Example 3:
Input: nums = [3, 3], target = 6
Expected Output: [0, 1]
--------------------------------------------------------------------------------
"""

def two_sum_map(nums: list[int], target: int) -> list[int]:
    seen_number = {}
    
    for i in range(len(nums)):
        missing_num = target - nums[i]
        if missing_num in seen_number:
            return [seen_number[missing_num], i]
        seen_number[nums[i]] = i

    return []

        


# CODE VERIFICATION (Run this file in your terminal to test your logic)
if __name__ == "__main__":
    print("Test 1 Result:", two_sum_map([2, 7, 11, 15], 9))   # Output: [0, 1]
    print("Test 2 Result:", two_sum_map([3, 2, 4], 6))        # Output: [1, 2]
    print("Test 3 Result:", two_sum_map([3, 3], 6))# Expected: [0, 1] or [1, 0]