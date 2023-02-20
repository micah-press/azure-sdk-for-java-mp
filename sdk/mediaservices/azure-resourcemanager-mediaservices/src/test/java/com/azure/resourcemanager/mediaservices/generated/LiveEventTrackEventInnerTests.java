// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventTrackEventInner;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackEventData;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackEventType;
import com.azure.resourcemanager.mediaservices.models.LiveEventTrackType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class LiveEventTrackEventInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventTrackEventInner model =
            BinaryData
                .fromString(
                    "{\"eventType\":\"TrackEvent/IngestHeartbeat\",\"eventTime\":\"2021-02-03T02:01:52Z\",\"data\":{\"trackName\":\"wzxltjc\",\"trackType\":\"audio\",\"bitrate\":598622795111508954,\"incomingBitrate\":3612428382061476540,\"lastTimestamp\":\"navvwx\",\"timescale\":\"byqunyow\",\"overlapCount\":8184174444781433747,\"discontinuityCount\":6859561979091901911,\"nonincreasingCount\":4661329361836653803,\"unexpectedBitrate\":true,\"state\":\"fvpdbo\",\"healthy\":true,\"lastFragmentArrivalTime\":\"2021-11-02T17:27:56Z\",\"ingestDriftValue\":\"j\",\"transcriptionState\":\"hkr\",\"transcriptionLanguage\":\"bdeibqipqk\"}}")
                .toObject(LiveEventTrackEventInner.class);
        Assertions.assertEquals(LiveEventTrackEventType.TRACK_EVENT_INGEST_HEARTBEAT, model.eventType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T02:01:52Z"), model.eventTime());
        Assertions.assertEquals("wzxltjc", model.data().trackName());
        Assertions.assertEquals(LiveEventTrackType.AUDIO, model.data().trackType());
        Assertions.assertEquals(598622795111508954L, model.data().bitrate());
        Assertions.assertEquals(3612428382061476540L, model.data().incomingBitrate());
        Assertions.assertEquals("navvwx", model.data().lastTimestamp());
        Assertions.assertEquals("byqunyow", model.data().timescale());
        Assertions.assertEquals(8184174444781433747L, model.data().overlapCount());
        Assertions.assertEquals(6859561979091901911L, model.data().discontinuityCount());
        Assertions.assertEquals(4661329361836653803L, model.data().nonincreasingCount());
        Assertions.assertEquals(true, model.data().unexpectedBitrate());
        Assertions.assertEquals("fvpdbo", model.data().state());
        Assertions.assertEquals(true, model.data().healthy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-02T17:27:56Z"), model.data().lastFragmentArrivalTime());
        Assertions.assertEquals("j", model.data().ingestDriftValue());
        Assertions.assertEquals("hkr", model.data().transcriptionState());
        Assertions.assertEquals("bdeibqipqk", model.data().transcriptionLanguage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventTrackEventInner model =
            new LiveEventTrackEventInner()
                .withEventType(LiveEventTrackEventType.TRACK_EVENT_INGEST_HEARTBEAT)
                .withEventTime(OffsetDateTime.parse("2021-02-03T02:01:52Z"))
                .withData(
                    new LiveEventTrackEventData()
                        .withTrackName("wzxltjc")
                        .withTrackType(LiveEventTrackType.AUDIO)
                        .withBitrate(598622795111508954L)
                        .withIncomingBitrate(3612428382061476540L)
                        .withLastTimestamp("navvwx")
                        .withTimescale("byqunyow")
                        .withOverlapCount(8184174444781433747L)
                        .withDiscontinuityCount(6859561979091901911L)
                        .withNonincreasingCount(4661329361836653803L)
                        .withUnexpectedBitrate(true)
                        .withState("fvpdbo")
                        .withHealthy(true)
                        .withLastFragmentArrivalTime(OffsetDateTime.parse("2021-11-02T17:27:56Z"))
                        .withIngestDriftValue("j")
                        .withTranscriptionState("hkr")
                        .withTranscriptionLanguage("bdeibqipqk"));
        model = BinaryData.fromObject(model).toObject(LiveEventTrackEventInner.class);
        Assertions.assertEquals(LiveEventTrackEventType.TRACK_EVENT_INGEST_HEARTBEAT, model.eventType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-03T02:01:52Z"), model.eventTime());
        Assertions.assertEquals("wzxltjc", model.data().trackName());
        Assertions.assertEquals(LiveEventTrackType.AUDIO, model.data().trackType());
        Assertions.assertEquals(598622795111508954L, model.data().bitrate());
        Assertions.assertEquals(3612428382061476540L, model.data().incomingBitrate());
        Assertions.assertEquals("navvwx", model.data().lastTimestamp());
        Assertions.assertEquals("byqunyow", model.data().timescale());
        Assertions.assertEquals(8184174444781433747L, model.data().overlapCount());
        Assertions.assertEquals(6859561979091901911L, model.data().discontinuityCount());
        Assertions.assertEquals(4661329361836653803L, model.data().nonincreasingCount());
        Assertions.assertEquals(true, model.data().unexpectedBitrate());
        Assertions.assertEquals("fvpdbo", model.data().state());
        Assertions.assertEquals(true, model.data().healthy());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-02T17:27:56Z"), model.data().lastFragmentArrivalTime());
        Assertions.assertEquals("j", model.data().ingestDriftValue());
        Assertions.assertEquals("hkr", model.data().transcriptionState());
        Assertions.assertEquals("bdeibqipqk", model.data().transcriptionLanguage());
    }
}