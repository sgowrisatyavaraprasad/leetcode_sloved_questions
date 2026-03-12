class Solution:
    def asteroidsDestroyed(self, mass: int, asteroids: List[int]) -> bool:
        a = sorted(asteroids)
        for i in a:
            if i > mass:
                return False
            else:
                mass += i
        return True