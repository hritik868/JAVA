# Share name, Date of purchase, Cost price, Number of shares, Selling price
share = ("TCS", "2023-11-20", 3500, 10, 4150)

# Calculate the total cost of the portfolio
total_cost = share[2] * share[3]

# Calculate the total amount gained or lost
total_gain = (share[4] - share[2]) * share[3]

# Calculate the percentage profit made or loss incurred
percentage_profit = (total_gain / total_cost) * 100

print("Share: ", share[0])
print("The total cost of the portfolio is: ", total_cost)
print("The total amount gained or lost is: ", total_gain)
if total_gain > 0:
    print("The percentage profit made is: ", percentage_profit)
elif total_gain < 0:
    print("The percentage loss incurred is: ", percentage_profit)
else:
    print("The portfolio has no profit or loss")
