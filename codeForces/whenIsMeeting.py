from datetime import datetime

month_map = {
    "January": 1,
    "February": 2,
    "March": 3,
    "April": 4,
    "May": 5,
    "June": 6,
    "July": 7,
    "August": 8,
    "September": 9,
    "October": 10,
    "November": 11,
    "December": 12
}

def daysBetween(date1, date2):
    # Convert to datetime objects
    date_format = "%m %d %Y"
    first_date = datetime.strptime(date1, date_format)
    second_date = datetime.strptime(date2, date_format)
    
    delta = (second_date - first_date).days
    return(abs(delta))

line1 = input().split()
line2 = input().split()

line1[0] = str(month_map[line1[0]])
line2[0] = str(month_map[line2[0]])

date1 = f"{line1[0]} {line1[1][:-1]} {line1[2]}"
date2 = f"{line2[0]} {line2[1][:-1]} {line2[2]}"

result = daysBetween(date1, date2)
print(result)