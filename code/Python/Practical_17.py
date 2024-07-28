from operator import itemgetter

#list of tuples with item and their price
items_prices = [("Pen: ", 12.50), ("Pencil: ", 6.25),("Notebook: ", 90.00), ("Book: ", 250.50)]


# Sorting the list of tuples in descending order by price
sorted_items = sorted(items_prices,key=itemgetter(1), reverse=True)
print(sorted_items)