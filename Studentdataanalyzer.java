class Studentdataanalyzer{
    public static void main(String[] args) {
        // Step a: Initialize the studentData string
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Step b: Split the studentData string into an array of individual student records
        String[] studentRecords = studentData.split(", ");

        // Step c: Create arrays to store student names and scores
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];

        // Step d: Populate the arrays by extracting data from the split records
        for (int i = 0; i < studentRecords.length; i++) {
            String[] recordComponents = studentRecords[i].split(":");
            studentNames[i] = recordComponents[0];
            studentScores[i] = Integer.parseInt(recordComponents[1]);
        }

        // Step 1: Calculate the total number of students
        int totalStudents = studentNames.length;
        System.out.println("Total number of students: " + totalStudents);

        // Step 2: Calculate the average score of all students
        double sum = 0;
        for (int score : studentScores) {
            sum += score;
        }
        double averageScore = sum / totalStudents;
        System.out.println("Average score of all students: " + averageScore);

        // Step 3: Find the highest score and the student who achieved it
        int maxScore = studentScores[0];
        String topScorer = studentNames[0];
        for (int i = 1; i < totalStudents; i++) {
            if (studentScores[i] > maxScore) {
                maxScore = studentScores[i];
                topScorer = studentNames[i];
            }
        }
        System.out.println("Highest score: " + maxScore + " achieved by " + topScorer);

        // Step 4: Find the lowest score and the student who achieved it
        int minScore = studentScores[0];
        String lowestScorer = studentNames[0];
        for (int i = 1; i < totalStudents; i++) {
            if (studentScores[i] < minScore) {
                minScore = studentScores[i];
                lowestScorer = studentNames[i];
            }
        }
        System.out.println("Lowest score: " + minScore + " achieved by " + lowestScorer);
    }
}