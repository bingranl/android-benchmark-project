package com.android.example.module06_module017_module8

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()

	fun method0(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_4: okio.Throttler = okio.Throttler()
		local_var_2_4.bytesPerSecond(-360656775869561763, -4329259273805415020, 4911432437574644374)

		param0.isDisposed()

		val local_var_2_5: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_5.throwIfCanceled()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener = com.squareup.workflow.diagnostic.SimpleLoggingDiagnosticListener()
		local_var_2_3.onWorkflowStarted(7599486338596128819, 987871543848082546, "SomeString", "SomeString", kotlin.Any(), kotlin.Any(), false)

		param0.isDisposed()

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param3: io.reactivex.observers.TestObserver<kotlin.Any>
	) {
		val local_var_2_4: androidx.core.os.CancellationSignal = androidx.core.os.CancellationSignal()
		local_var_2_4.getCancellationSignalObject()

		param0.isDisposed()

	}
}
