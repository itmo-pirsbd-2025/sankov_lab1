var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":10,"id":271,"methods":[{"el":9,"sc":5,"sl":6}],"name":"OptimizedQuickSortTest","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":6}],"name":"oneElement","pass":true,"statements":[{"sl":8}]},"test_11":{"methods":[{"sl":6}],"name":"duplicates","pass":true,"statements":[{"sl":8}]},"test_12":{"methods":[{"sl":6}],"name":"reverse","pass":true,"statements":[{"sl":8}]},"test_13":{"methods":[{"sl":6}],"name":"sorted","pass":true,"statements":[{"sl":8}]},"test_17":{"methods":[{"sl":6}],"name":"random","pass":true,"statements":[{"sl":8}]},"test_4":{"methods":[{"sl":6}],"name":"almostSorted","pass":true,"statements":[{"sl":8}]},"test_5":{"methods":[{"sl":6}],"name":"empty","pass":true,"statements":[{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [11, 17, 12, 4, 5, 0, 13], [], [11, 17, 12, 4, 5, 0, 13], [], []]
