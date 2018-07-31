/**
 * Created by thomas31 on 7/31/2018.
 */
var gulp       = require('gulp');


gulp.task('frameworks', function () {
    return gulp.src(['bower_components/**/*.*'])
        .pipe(gulp.dest('../main/resources/static/app/components/'));
});
