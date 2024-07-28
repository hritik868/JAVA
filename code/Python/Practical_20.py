names = ["Deepak", "Hritik", "Kartik", "Manish", "Praful"]
roll_numbers = [40, 97, 68, 13, 95]
marks = [45, 63, 75, 78, 67]


# packing lists
list_of_tuples = list(zip(names, roll_numbers, marks))
print(list_of_tuples)


# Unpacking lists
names_list, roll_numbers_list, marks_list = zip(*list_of_tuples)
names_tuple = tuple(names_list)
roll_numbers_tuple = tuple(roll_numbers_list)
marks_tuple = tuple(marks_list)



print(names_tuple)
print(roll_numbers_tuple)
print(marks_tuple)
