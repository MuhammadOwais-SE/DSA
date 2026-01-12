# Function to replace all spaces in a string with '%20'
def remove_space(sentence):
    word = ""
    for char in sentence:
        if char == " ":
            word += "%20"
        else:
            word += char
    return word

# Example usage:
# print(remove_space("Mr 3ohn Smit h 13"))

# Function to replace all spaces in a string with '%20'
def spaceFiller(sentence):
    result = ""
    for ch in sentence:
        if ch == " ":
            result += "%20"
        else:
            result += ch
    print(result)

# Example usage
sentence = "Mr 3ohn Smit h 13"
spaceFiller(sentence)

# Function to check if a string has all unique characters
def unique_string(word):
    unique = ""
    duplicate = ""
    for char in word:
        if char in unique:
            duplicate += char
        unique += char
    print(f"Unique characters: {unique}")
    print(f"Duplicate characters: {duplicate}")

# Example usage:
word = "abcc"
unique_string(word)


def palindromeV2(words):
    word_no_space = ""
    for char in words:
        if char != " ":
            word_no_space += char.lower()

    reverse_word = word_no_space[::-1]
    if reverse_word == word_no_space:
        print(f"'{words}' is a palindrome.")
    else:
        print(f"'{words}' is not a palindrome.")

# Test the function
words = "A man a plan a canal Panama"
palindromeV2(words)



# Bruto Force... O(n2)
# for i in range(len(list)):
#     print(i)
#     for j+1 in range( len(list)):
#         if(target == list[i]+ list[j]):
#             print(f"These two { list[i]},{ list[j]} are the combination which is the sum of {target}")

# Optimise Technique O(n)
"""
    6+3=9
    so we may store the list value one by one and check if the compute_subtract is already present in the set. if it is then we got our pairs.
    check that 9-n = 6 (for the value which we may store in the set, which we passed by)
    O(n)
"""

def sum_two_num(nums):
    seen = set()
    for num in nums:
        print(num)

        compute_subtract = target - num
        if compute_subtract in seen: # O(1)
            return f"The pairs are {num}, {compute_subtract} for the {target}"
        seen.add(num)

print(sum_two_num(nums))

word1 = "pale"
word2 = "ple"
def operationChecker(word1, word2):
    length_word1 = len(word1)
    length_word2 = len(word2)

    # edge case
    if abs(length_word1 - length_word2) > 1:
        # B/c it has been edit/insert two more character operation perform twice. It won't consider
        # single/one or zero edit
        return False

    # We will always consider s1 shorter string and s2 longer string
    # so insert/remove logic becomes simple and consistent.
    if length_word1 > length_word2:
        # so we swapped the value
        word1, word2 = word2, word1
        length_word1, length_word2 = length_word2, length_word1

    # I am using two pointer technique
    i = j = 0
    found_mismatch = False

    while i < length_word1 and j < length_word2:
        if word1[i] != word2[j]:
            if found_mismatch:
                return False
            else:
                found_mismatch = True
                if length_word1 == length_word2: # for replace case, we increase both i and j
                    i += 1
        else:
            i += 1 # matched, now we move both i and j. If not match only move the j, whichs is greater string.
        j += 1

    return True

print(
    operationChecker(word1, word2)
)