def knapsack(jobs, totalCapacity):
    jobs.sort(key=lambda x: x[0]/x[1], reverse=True)
    sortedJobs, totalWeight, totalProfit = [], 0, 0
    for job in jobs:
        if (job[0] + totalWeight) <= totalCapacity:
            totalWeight += job[0]
            sortedJobs.append(job[2])
    return sortedJobs, totalWeight

#weights, profit, name
jobs = [(10, 60, '1'), (20, 100, '2'), (20, 120, '3')]
totalCapacity = 50
sortedJobs, totalWeight = knapsack(jobs, totalCapacity)
print(f"sorted jobs:    {sortedJobs}")