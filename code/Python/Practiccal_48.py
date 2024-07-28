import random
import os

# Function to select a random element from a list
def random_from_list(my_list):
    return random.choice(my_list)

# Function to select a random element from a set
def random_from_set(my_set):
    return random.choice(list(my_set))

# Function to select a random element from a dictionary's values
def random_from_dict_values(my_dict):
    return random.choice(list(my_dict.values()))

# Function to select a random file from a directory
def random_file_from_directory(directory_path):
    files = [f for f in os.listdir(directory_path) if os.path.isfile(os.path.join(directory_path, f))]
    return random.choice(files)

# Example data structures
my_list = [1, 2, 3, 4, 5]
my_set = {10, 20, 30, 40, 50}
my_dict = {'a': 100, 'b': 200, 'c': 300, 'd': 400, 'e': 500}
directory_path = 'C:\Users\Kumar\OneDrive\Desktop\code\Python\hello.txt' 

# Select a random element from each data structure
random_from_list_result = random_from_list(my_list)
random_from_set_result = random_from_set(my_set)
random_from_dict_values_result = random_from_dict_values(my_dict)
random_file_result = random_file_from_directory(directory_path)

# Display the results
print("Random element from list:", random_from_list_result)
print("Random element from set:", random_from_set_result)
print("Random element from dictionary values:", random_from_dict_values_result)
print("Random file from directory:", random_file_result)