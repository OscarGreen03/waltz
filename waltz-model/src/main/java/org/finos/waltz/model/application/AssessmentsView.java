package org.finos.waltz.model.application;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.finos.waltz.model.assessment_definition.AssessmentDefinition;
import org.finos.waltz.model.assessment_rating.AssessmentRating;
import org.finos.waltz.model.rating.RatingSchemeItem;
import org.immutables.value.Value;

import java.util.Set;

@Value.Immutable
@JsonSerialize(as = ImmutableAssessmentsView.class)
public interface AssessmentsView {

    Set<AssessmentRating> assessmentRatings();
    Set<RatingSchemeItem> ratingSchemeItems();
    Set<AssessmentDefinition> assessmentDefinitions();
}
