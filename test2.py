import csv
with open('filecsv_1.csv', 'w') as filecsv:
    rs = csv.writer(filecsv, delimiter=',')
    rs.writerow(['Programming Language', 'Design By', 'Year', 'Extension'])
    rs.writerow(['Python', 'Godsum', '1991', '.py'])
    rs.writerow(['Java', 'James Gosling', '1995', '.java'])
    rs.writerow(['ABC', 'BTEC', '0', ''])
    rs.writerow(['C#', 'Microsoft', '1999', '.cs'])
    rs.writerow(['BCD', '', '1989', ''])
    rs.writerow(['C++', 'AAA', '1991', '.cpp'])
print('Done writing')