print("hello python")


def count_meteor_showers(B, L, E):
    interval = 50
    birth_year = -B
    death_year = birth_year  + L 
    meteor_year = E 
    count = 0

   # Move back in intervals to find the last meteor shower within the lifetime range
    while meteor_year - interval >= birth_year:
        meteor_year -= interval
    
    # Count all meteor showers within the person's lifetime
    count = 0
    while meteor_year <= death_year:
        if meteor_year >= birth_year:
            count += 1
        meteor_year += interval  # Move to the next meteor shower
    
    return count



with open("input.txt", "r") as inputFile, open("output.txt", "w") as outputFile:   
    n = int(inputFile.readline().strip())

    for _ in range(n):
        B, L, E = map(int, inputFile.readline().strip().split())
        result = count_meteor_showers(B, L, E)
        print(result)
        outputFile.write(str(result) + "\n")