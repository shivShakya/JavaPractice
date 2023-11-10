#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

class Point {
public:
    int x;
    int y;
    int line = 0;

    Point(int x, int y) {
        this->x = x;
        this->y = y;
    }

    void createLine(Point A, Point B) {
        line += 1;
        cout << "AB" << endl;
    }

    double distance(Point B) {
        int dx = B.x - x;
        int dy = B.y - y;

        return sqrt(dx * dx + dy * dy);
    }

    void findNeighbours(Point A) {
        // Implement this function to find neighbors of the current point.
    }
};

int main() {
    Point A(0, 0);
    Point B(1, 2);
    Point C(2, 2);
    Point D(0, 3);
    Point E(2, -2);
    Point F(1, -2);
    double minDistance = A.distance(B);
    vector<int> minDistanceIndices = {0};

    Point arr[] = {A, B, C, D, E, F};
    int arrSize = sizeof(arr) / sizeof(arr[0]);

    for (int i = 1; i < arrSize; i++) {
        double x = A.distance(arr[i]);
        cout << "Distance from A to point " << i + 1 << ": " << x << endl;
        if (x < minDistance) {
            minDistance = x;
            minDistanceIndices.clear();
            minDistanceIndices.push_back(i);
        } else if (x == minDistance) {
            minDistanceIndices.push_back(i);
        }
    }

    cout << "Minimum distance from A to any other point: " << minDistance << endl;
    cout << "Indexes where the minimum distance is present: ";
    for (int index : minDistanceIndices) {
        cout << index + 1 << " ";
    }
    cout << endl;

    return 0;
}
