# Tuple
list = [(97,68), ("Hritik"), (), ("Deepak","Kartik","Praful"), (), ("Study","Hardwork","Money")]


# count how many times empty tuple appears in list
empty = list.count(()) 
for i in range(empty):
    # remove the first occurrence of () in each iteration
    list.remove(()) 
print(list)
