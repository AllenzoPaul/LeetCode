class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        
        index = []
        k = len(p)
        freq = {}

        for i in p:
            freq[i] = freq.get(i,0)+1

        window_freq={}

        for i in s[:k]:
            window_freq[i] = window_freq.get(i,0)+1

        if window_freq == freq:
            index.append(0)

        for i in range(k,len(s)):
            window_freq[s[i-k]] -=1
            if window_freq[s[i-k]] == 0:
                del window_freq[s[i-k]]
            window_freq[s[i]] = window_freq.get(s[i],0)+1

            if window_freq == freq:
                index.append(i-k+1)

        return index
