import unittest

from Solver import Solver


class MyTestCase(unittest.TestCase):
    def test_Solver(self):
        self.assertEqual(Solver().calculate(), 5)


if __name__ == '__main__':
    unittest.main()
