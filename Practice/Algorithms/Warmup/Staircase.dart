import 'dart:io';

void main() {
  var line = stdin.readLineSync() ?? '0';
  var N = int.parse(line);
  for (int i = 1; i <= N; i++) {
    for (int j = N - i; j >= 1; j--) {
      stdout.write(' ');
    }
    for(int j=1;j<=i;j++){
      stdout.write('#');
    }
    stdout.write('\n');
  }
}
