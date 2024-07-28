import random

# Selecting a random element from a list
my_list = [10, 20, 30, 40, 50]
random_from_list = random.choice(my_list)
print(f"Random element from list: {random_from_list}")

# Selecting a random element from a set
my_set = {1, 2, 3, 4, 5}
random_from_set = random.choice(list(my_set))  # Convert set to a list to use random.choice()
print(f"Random element from set: {random_from_set}")

# Selecting a random value from a dictionary
my_dict = {'a': 100, 'b': 200, 'c': 300, 'd': 400}
random_from_dict_values = random.choice(list(my_dict.values()))  # Convert dictionary values to a list to use random.choice()
print(f"Random value from dictionary: {random_from_dict_values}")

# Selecting a random line from a file
with open('hello.txt', 'r') as file:
    lines = file.readlines()
    random_from_file = random.choice(lines).strip()  # Remove newline character if present
    print(f"Random line from file: {random_from_file}")