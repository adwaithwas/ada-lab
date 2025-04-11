def activitySelection(activities, deadline):
    activities.sort(key= lambda x: x[1])
    
    timeTaken, timeline = 0, []
    
    for job in activities:
        
        startTime, endTime = job
        if (endTime - startTime) + timeTaken <= deadline:
            timeline.append(job)
            timeTaken += endTime - startTime
    return timeline

#start time, end time
activities = [(1,3),(2,5),(3,4),(4,7)]
deadline = 8
ans = activitySelection(activities, deadline)
print(ans)
